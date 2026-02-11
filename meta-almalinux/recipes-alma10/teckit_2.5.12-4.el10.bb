
PN = "teckit"
PE = "0"
PV = "2.5.12"
PR = "4.el10"
PACKAGES = "teckit teckit-devel"


URI_teckit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/teckit-2.5.12-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:teckit = " \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 expat \
 glibc \
"

URI_teckit-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/teckit-devel-2.5.12-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:teckit-devel = " \
 teckit \
 pkgconf-pkg-config \
"
