/**
 * This class should provide the following mappings based on the
 * properties of the zip code provided:
 *
 * Base value per sq ft:
 *
 * 	0xxxx: $100/sq ft (also the default base value)
 * 	1xxxx: $80/sq ft
 * 	2xxxx: $250/sq ft
 * 	3xxxx: $150/sq ft
 * 	4xxxx: $110/sq ft
 * 	5xxxx: $50/sq ft
 * 	6xxxx: $70/sq ft
 * 	7xxxx: $90/sq ft
 * 	8xxxx: $135/sq ft
 * 	9xxxx: $180/sq ft
 *
 * Additionally, any zip code ending with an even number has an additional 10%.
 * For example, if the zip is 60120, the price per sq ft is $70 + $7 = $77).
 */

public class MarketValueMapper {

	// TODO:  Implement this method
	public BigInteger getValuePerSqFoot(String zip) {

	}
}
