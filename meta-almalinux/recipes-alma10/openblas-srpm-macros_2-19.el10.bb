
inherit dnf-bridge

PN = "openblas-srpm-macros"
PE = "0"
PV = "2"
PR = "19.el10"
PACKAGES = "openblas-srpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/openblas-srpm-macros-2-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openblas-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-srpm-macros-2-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_openblas-srpm-macros}"
RDEPENDS:openblas-srpm-macros = ""
