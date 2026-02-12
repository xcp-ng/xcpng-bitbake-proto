
inherit dnf-bridge

PN = "ntpstat"
PE = "0"
PV = "0.6"
PR = "13.el10"
PACKAGES = "ntpstat"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ntpstat-0.6-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ntpstat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ntpstat-0.6-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ntpstat}"
RDEPENDS:ntpstat = " \
 chrony \
 bash \
"
