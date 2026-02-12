
inherit dnf-bridge

PN = "aide"
PE = "0"
PV = "0.18.6"
PR = "8.el10_0.2"
PACKAGES = "aide"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/aide-0.18.6-8.el10_0.2.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_aide = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aide-0.18.6-8.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_aide}"
RDEPENDS:aide = " \
 libacl \
 zlib-ng-compat \
 e2fsprogs-libs \
 gnutls \
 audit-libs \
 pcre2 \
 libcurl \
 glibc \
 libselinux \
"
