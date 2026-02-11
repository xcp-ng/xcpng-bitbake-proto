
PN = "openjpeg2"
PE = "0"
PV = "2.5.2"
PR = "4.el10_0.1"
PACKAGES = "openjpeg2 openjpeg2-devel openjpeg2-tools openjpeg2-devel-docs"


URI_openjpeg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openjpeg2-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2 = "
 glibc
"

URI_openjpeg2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openjpeg2-devel-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2-devel = "
 openjpeg2
 openjpeg2-tools
 cmake-filesystem
 pkgconf-pkg-config
"

URI_openjpeg2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openjpeg2-tools-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2-tools = "
 lcms2
 libpng
 openjpeg2
 glibc
 libtiff
"

URI_openjpeg2-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openjpeg2-devel-docs-2.5.2-4.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:openjpeg2-devel-docs = ""
