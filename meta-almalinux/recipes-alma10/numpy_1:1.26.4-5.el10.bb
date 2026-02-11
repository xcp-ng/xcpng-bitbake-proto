
PN = "numpy"
PE = "1"
PV = "1.26.4"
PR = "5.el10"
PACKAGES = "python3-numpy python3-numpy-f2py python3-numpy-doc"


URI_python3-numpy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-numpy-1.26.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-numpy = " \
 glibc \
 flexiblas-netlib \
 libstdc++ \
 python3 \
"

URI_python3-numpy-f2py = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-numpy-f2py-1.26.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-numpy-f2py = " \
 python3 \
 python3-numpy \
 python3-devel \
"

URI_python3-numpy-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-numpy-doc-1.26.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-numpy-doc = " \
 python3-numpy \
"
