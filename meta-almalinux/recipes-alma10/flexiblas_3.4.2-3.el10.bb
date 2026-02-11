
inherit dnf-bridge

PN = "flexiblas"
PE = "0"
PV = "3.4.2"
PR = "3.el10"
PACKAGES = "flexiblas flexiblas-devel flexiblas-netlib flexiblas-netlib64 flexiblas-openblas-openmp flexiblas-openblas-openmp64 flexiblas-openblas-serial flexiblas-hook-profile flexiblas-hook-profile64 flexiblas-openblas-serial64 flexiblas-openblas-threads flexiblas-openblas-threads64"


URI_flexiblas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas = " \
 flexiblas-netlib \
"

URI_flexiblas-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-devel-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-devel = " \
 flexiblas \
 flexiblas-netlib \
 flexiblas-netlib64 \
 pkgconf-pkg-config \
 glibc \
"

URI_flexiblas-netlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-netlib-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-netlib = " \
 flexiblas \
 flexiblas-openblas-openmp \
 libgcc \
 libgfortran \
 libquadmath \
 glibc \
"

URI_flexiblas-netlib64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-netlib64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-netlib64 = " \
 flexiblas \
 libgcc \
 flexiblas-openblas-openmp64 \
 libgfortran \
 libquadmath \
 glibc \
"

URI_flexiblas-openblas-openmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-openmp-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-openmp = " \
 glibc \
 openblas-openmp \
 flexiblas-netlib \
 flexiblas \
"

URI_flexiblas-openblas-openmp64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-openmp64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-openmp64 = " \
 glibc \
 flexiblas-netlib64 \
 openblas-openmp64 \
 flexiblas \
"

URI_flexiblas-openblas-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-serial-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-serial = " \
 glibc \
 flexiblas-netlib \
 openblas-serial \
 flexiblas \
"

URI_flexiblas-hook-profile = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-hook-profile-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-hook-profile = " \
 flexiblas \
 flexiblas-netlib \
 libgfortran \
 libquadmath \
 glibc \
"

URI_flexiblas-hook-profile64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-hook-profile64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-hook-profile64 = " \
 flexiblas \
 flexiblas-netlib64 \
 libgfortran \
 libquadmath \
 glibc \
"

URI_flexiblas-openblas-serial64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-serial64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-serial64 = " \
 glibc \
 flexiblas-netlib64 \
 flexiblas \
 openblas-serial64 \
"

URI_flexiblas-openblas-threads = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-threads-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-threads = " \
 glibc \
 openblas-threads \
 flexiblas-netlib \
 flexiblas \
"

URI_flexiblas-openblas-threads64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-threads64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-threads64 = " \
 glibc \
 flexiblas-netlib64 \
 openblas-threads64 \
 flexiblas \
"
