
PN = "oniguruma"
PE = "0"
PV = "6.9.9"
PR = "7.el10"
PACKAGES = "oniguruma oniguruma-devel"


URI_oniguruma = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/oniguruma-6.9.9-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oniguruma = " \
 glibc \
"

URI_oniguruma-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/oniguruma-devel-6.9.9-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oniguruma-devel = " \
 oniguruma \
 bash \
 pkgconf-pkg-config \
"
