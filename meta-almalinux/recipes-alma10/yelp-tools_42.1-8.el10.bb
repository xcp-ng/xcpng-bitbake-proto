
inherit dnf-bridge

PN = "yelp-tools"
PE = "0"
PV = "42.1"
PR = "8.el10"
PACKAGES = "yelp-tools"


URI_yelp-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yelp-tools-42.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:yelp-tools = " \
 python3 \
 itstool \
 mallard-rng \
 libxslt \
 yelp-xsl \
 libxml2 \
 python3-lxml \
"
