
PN = "crontabs"
PE = "0"
PV = "1.11^20190603git9e74f2d"
PR = "6.el10"
PACKAGES = "crontabs"


URI_crontabs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/crontabs-1.11^20190603git9e74f2d-6.el10.noarch.rpm;unpack=0"
RDEPENDS:crontabs = " \
 sed \
 bash \
 cronie \
"
