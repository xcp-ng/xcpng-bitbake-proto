
inherit dnf-bridge

PN = "s390utils"
PE = "2"
PV = "2.36.0"
PR = "2.el10"
PACKAGES = "s390utils s390utils-se-data"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/s390utils-2.36.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_s390utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/s390utils-2.36.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_s390utils}"
RDEPENDS:s390utils = " \
 s390utils-se-data \
 openssl-libs \
 libgcc \
 bash \
 libcurl \
 glibc \
"

URI_s390utils-se-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/s390utils-se-data-2.36.0-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_s390utils-se-data}"
RDEPENDS:s390utils-se-data = " \
 bash \
"
