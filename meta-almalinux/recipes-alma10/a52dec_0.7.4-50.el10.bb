
PN = "a52dec"
PE = "0"
PV = "0.7.4"
PR = "50.el10"
PACKAGES = "a52dec liba52 liba52-devel"


URI_a52dec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/a52dec-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:a52dec = " \
 glibc \
 liba52 \
"

URI_liba52 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liba52-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liba52 = " \
 glibc \
"

URI_liba52-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liba52-devel-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liba52-devel = " \
 liba52 \
"
