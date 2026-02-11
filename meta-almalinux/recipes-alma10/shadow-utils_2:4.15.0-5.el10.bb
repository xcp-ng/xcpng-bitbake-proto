
inherit dnf-bridge

PN = "shadow-utils"
PE = "2"
PV = "4.15.0"
PR = "5.el10"
PACKAGES = "shadow-utils shadow-utils-subid shadow-utils-subid-devel"


URI_shadow-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/shadow-utils-4.15.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:shadow-utils = " \
 setup \
 libacl \
 libxcrypt \
 audit-libs \
 libattr \
 pam-libs \
 glibc \
 libselinux \
 libsemanage \
 libeconf \
"

URI_shadow-utils-subid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/shadow-utils-subid-4.15.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:shadow-utils-subid = " \
 libacl \
 libxcrypt \
 audit-libs \
 libattr \
 pam-libs \
 glibc \
 libselinux \
 libsemanage \
 libeconf \
"

URI_shadow-utils-subid-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/shadow-utils-subid-devel-4.15.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:shadow-utils-subid-devel = " \
 shadow-utils-subid \
"
