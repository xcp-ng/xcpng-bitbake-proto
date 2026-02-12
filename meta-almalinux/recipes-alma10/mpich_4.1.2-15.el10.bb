
inherit dnf-bridge

PN = "mpich"
PE = "0"
PV = "4.1.2"
PR = "15.el10"
PACKAGES = "mpich mpich-autoload mpich-devel mpich-doc python3-mpich"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mpich-4.1.2-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mpich = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpich}"
RDEPENDS:mpich = " \
 python3 \
 libgcc \
 libgfortran \
 hwloc-libs \
 environment-modules \
 libfabric \
 libstdc++ \
 glibc \
 perl-interpreter \
"

URI_mpich-autoload = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-autoload-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpich-autoload}"
RDEPENDS:mpich-autoload = " \
 mpich \
"

URI_mpich-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-devel-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpich-devel}"
RDEPENDS:mpich-devel = " \
 redhat-rpm-config \
 pkgconf-pkg-config \
 rpm-mpi-hooks \
 bash \
 gcc-gfortran \
 mpich \
"

URI_mpich-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-doc-4.1.2-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mpich-doc}"
RDEPENDS:mpich-doc = " \
 mpich-devel \
"

URI_python3-mpich = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-mpich-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-mpich}"
RDEPENDS:python3-mpich = " \
 python3 \
 mpich \
"
