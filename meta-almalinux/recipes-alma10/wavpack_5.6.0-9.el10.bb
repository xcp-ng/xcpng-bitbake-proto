
PN = "wavpack"
PE = "0"
PV = "5.6.0"
PR = "9.el10"
PACKAGES = "wavpack wavpack-devel"


URI_wavpack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wavpack-5.6.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wavpack = "
 glibc
"

URI_wavpack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/wavpack-devel-5.6.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wavpack-devel = "
 wavpack
 pkgconf-pkg-config
"
