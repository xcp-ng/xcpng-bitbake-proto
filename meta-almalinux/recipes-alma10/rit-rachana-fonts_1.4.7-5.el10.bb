
inherit dnf-bridge

PN = "rit-rachana-fonts"
PE = "0"
PV = "1.4.7"
PR = "5.el10"
PACKAGES = "rit-rachana-fonts"


URI_rit-rachana-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rit-rachana-fonts-1.4.7-5.el10.noarch.rpm;unpack=0"
RDEPENDS:rit-rachana-fonts = " \
 fonts-filesystem \
"
