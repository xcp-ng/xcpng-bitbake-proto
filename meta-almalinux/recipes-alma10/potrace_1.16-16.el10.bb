
PN = "potrace"
PE = "0"
PV = "1.16"
PR = "16.el10"
PACKAGES = "potrace potrace-devel potrace-doc"


URI_potrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/potrace-1.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:potrace = " \
 glibc \
 zlib-ng-compat \
"

URI_potrace-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/potrace-devel-1.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:potrace-devel = " \
 potrace \
"

URI_potrace-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/potrace-doc-1.16-16.el10.noarch.rpm;unpack=0"
RDEPENDS:potrace-doc = ""
