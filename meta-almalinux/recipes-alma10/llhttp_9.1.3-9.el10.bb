
inherit dnf-bridge

PN = "llhttp"
PE = "0"
PV = "9.1.3"
PR = "9.el10"
PACKAGES = "llhttp llhttp-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/llhttp-9.1.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_llhttp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llhttp-9.1.3-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_llhttp}"
RDEPENDS:llhttp = " \
 glibc \
"

URI_llhttp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/llhttp-devel-9.1.3-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_llhttp-devel}"
RDEPENDS:llhttp-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 llhttp \
"
