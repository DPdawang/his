package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupPrescriptionItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupPrescriptionItemsMapper {
    int countByExample(GroupPrescriptionItemsExample example);

    int deleteByExample(GroupPrescriptionItemsExample example);

    @Delete({
        "delete from group_prescription_items",
        "where Group_Prescription_Items_ID = #{groupPrescriptionItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupPrescriptionItemsId);

    @Insert({
        "insert into group_prescription_items (Group_Prescription_Items_ID, Group_Prescription_ID, ",
        "Drags_ID, Usage, Dosage, ",
        "Times, Days, Quantity, ",
        "Drugs_Advice)",
        "values (#{groupPrescriptionItemsId,jdbcType=INTEGER}, #{groupPrescriptionId,jdbcType=INTEGER}, ",
        "#{dragsId,jdbcType=INTEGER}, #{usage,jdbcType=CHAR}, #{dosage,jdbcType=DECIMAL}, ",
        "#{times,jdbcType=INTEGER}, #{days,jdbcType=INTEGER}, #{quantity,jdbcType=INTEGER}, ",
        "#{drugsAdvice,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupPrescriptionItemsId", before=true, resultType=Integer.class)
    int insert(GroupPrescriptionItems record);

    int insertSelective(GroupPrescriptionItems record);

    List<GroupPrescriptionItems> selectByExample(GroupPrescriptionItemsExample example);

    @Select({
        "select",
        "Group_Prescription_Items_ID, Group_Prescription_ID, Drags_ID, Usage, Dosage, ",
        "Times, Days, Quantity, Drugs_Advice",
        "from group_prescription_items",
        "where Group_Prescription_Items_ID = #{groupPrescriptionItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupPrescriptionItems selectByPrimaryKey(Integer groupPrescriptionItemsId);

    int updateByExampleSelective(@Param("record") GroupPrescriptionItems record, @Param("example") GroupPrescriptionItemsExample example);

    int updateByExample(@Param("record") GroupPrescriptionItems record, @Param("example") GroupPrescriptionItemsExample example);

    int updateByPrimaryKeySelective(GroupPrescriptionItems record);

    @Update({
        "update group_prescription_items",
        "set Group_Prescription_ID = #{groupPrescriptionId,jdbcType=INTEGER},",
          "Drags_ID = #{dragsId,jdbcType=INTEGER},",
          "Usage = #{usage,jdbcType=CHAR},",
          "Dosage = #{dosage,jdbcType=DECIMAL},",
          "Times = #{times,jdbcType=INTEGER},",
          "Days = #{days,jdbcType=INTEGER},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Drugs_Advice = #{drugsAdvice,jdbcType=VARCHAR}",
        "where Group_Prescription_Items_ID = #{groupPrescriptionItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupPrescriptionItems record);
}