
PN = "jitterentropy"
PE = "0"
PV = "3.6.0"
PR = "2.el10"
PACKAGES = "jitterentropy jitterentropy-devel"


URI_jitterentropy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jitterentropy-3.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jitterentropy = " \
 glibc \
"

URI_jitterentropy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jitterentropy-devel-3.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jitterentropy-devel = " \
 jitterentropy \
"
