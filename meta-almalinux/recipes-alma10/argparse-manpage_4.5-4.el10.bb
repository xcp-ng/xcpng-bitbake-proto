
inherit dnf-bridge

PN = "argparse-manpage"
PE = "0"
PV = "4.5"
PR = "4.el10"
PACKAGES = "argparse-manpage python3-argparse-manpage+setuptools python3-argparse-manpage"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/argparse-manpage-4.5-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_argparse-manpage = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/argparse-manpage-4.5-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_argparse-manpage}"
RDEPENDS:argparse-manpage = " \
 python3 \
 python3-argparse-manpage \
"

URI_python3-argparse-manpage+setuptools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-argparse-manpage+setuptools-4.5-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-argparse-manpage+setuptools}"
RDEPENDS:python3-argparse-manpage+setuptools = " \
 python3-setuptools \
 python3 \
 python3-argparse-manpage \
"

URI_python3-argparse-manpage = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-argparse-manpage-4.5-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-argparse-manpage}"
RDEPENDS:python3-argparse-manpage = " \
 python3 \
"
