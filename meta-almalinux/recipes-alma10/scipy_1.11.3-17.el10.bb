
inherit dnf-bridge

PN = "scipy"
PE = "0"
PV = "1.11.3"
PR = "17.el10"
PACKAGES = "python3-scipy python3-scipy-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/scipy-1.11.3-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-scipy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-scipy-1.11.3-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-scipy}"
RDEPENDS:python3-scipy = " \
 python3-numpy-f2py \
 python3 \
 flexiblas-netlib \
 libgcc \
 libgfortran \
 libstdc++ \
 glibc \
 python3-numpy \
"

URI_python3-scipy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-scipy-tests-1.11.3-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-scipy-tests}"
RDEPENDS:python3-scipy-tests = " \
 python3 \
 python3-pytest \
 python3-scipy \
"
