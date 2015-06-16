package cn.com.gps169.db.dao;

import cn.com.gps169.db.model.Vehicle;
import cn.com.gps169.db.model.VehicleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int countByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int deleteByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer vehicleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int insert(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int insertSelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    List<Vehicle> selectByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    Vehicle selectByPrimaryKey(Integer vehicleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Vehicle record);
}