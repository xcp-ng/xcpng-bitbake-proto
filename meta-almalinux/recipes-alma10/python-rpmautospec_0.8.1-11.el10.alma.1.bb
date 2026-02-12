
inherit dnf-bridge

PN = "python-rpmautospec"
PE = "0"
PV = "0.8.1"
PR = "11.el10.alma.1"
PACKAGES = "rpmautospec"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-rpmautospec-0.8.1-11.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpmautospec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpmautospec-0.8.1-11.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rpmautospec}"
RDEPENDS:rpmautospec = " \
 python3 \
 libgit2 \
 rpm-build-libs \
 rpm-libs \
"
