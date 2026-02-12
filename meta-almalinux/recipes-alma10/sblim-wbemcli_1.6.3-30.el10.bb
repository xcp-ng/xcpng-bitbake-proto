
inherit dnf-bridge

PN = "sblim-wbemcli"
PE = "0"
PV = "1.6.3"
PR = "30.el10"
PACKAGES = "sblim-wbemcli"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sblim-wbemcli-1.6.3-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sblim-wbemcli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-wbemcli-1.6.3-30.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-wbemcli}"
RDEPENDS:sblim-wbemcli = " \
 libgcc \
 curl \
 libstdc++ \
 libcurl \
 glibc \
"
