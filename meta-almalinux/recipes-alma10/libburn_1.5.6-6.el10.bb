
PN = "libburn"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "cdrskin libburn libburn-doc libburn-devel"


URI_cdrskin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cdrskin-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cdrskin = " \
 libburn \
 bash \
 glibc \
 coreutils \
 alternatives \
"

URI_libburn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libburn-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libburn = " \
 glibc \
"

URI_libburn-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libburn-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libburn-doc = ""

URI_libburn-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libburn-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libburn-devel = " \
 libburn \
 pkgconf-pkg-config \
"
