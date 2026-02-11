
PN = "fribidi"
PE = "0"
PV = "1.0.14"
PR = "4.el10"
PACKAGES = "fribidi fribidi-devel"


URI_fribidi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fribidi-1.0.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fribidi = " \
 glibc \
"

URI_fribidi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fribidi-devel-1.0.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fribidi-devel = " \
 fribidi \
 pkgconf-pkg-config \
"
