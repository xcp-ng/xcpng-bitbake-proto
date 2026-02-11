
inherit dnf-bridge

PN = "oqsprovider"
PE = "0"
PV = "0.8.0"
PR = "5.el10"
PACKAGES = "oqsprovider"


URI_oqsprovider = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oqsprovider-0.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oqsprovider = " \
 glibc \
 openssl \
 openssl-libs \
 liboqs \
"
