
inherit dnf-bridge

PN = "lapack"
PE = "0"
PV = "3.12.0"
PR = "7.el10"
PACKAGES = "blas lapack blas-devel blas64 blas64_ lapack-devel lapack-static lapack64 lapack64_ blas-static"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/lapack-3.12.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_blas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/blas-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_blas}"
RDEPENDS:blas = " \
 glibc \
 libgcc \
 libgfortran \
"

URI_lapack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lapack-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lapack}"
RDEPENDS:lapack = " \
 glibc \
 libgcc \
 libgfortran \
 blas \
"

URI_blas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas-devel-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_blas-devel}"
RDEPENDS:blas-devel = " \
 blas-devel \
 blas64 \
 blas64_ \
 cmake-filesystem \
 pkgconf-pkg-config \
 blas \
 gcc-gfortran \
"

URI_blas64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas64-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_blas64}"
RDEPENDS:blas64 = " \
 glibc \
 libgcc \
 libgfortran \
"

URI_blas64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas64_-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_blas64_}"
RDEPENDS:blas64_ = " \
 glibc \
 libgcc \
 libgfortran \
"

URI_lapack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack-devel-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lapack-devel}"
RDEPENDS:lapack-devel = " \
 blas-devel \
 lapack \
 lapack-devel \
 cmake-filesystem \
 lapack64 \
 lapack64_ \
 pkgconf-pkg-config \
"

URI_lapack-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack-static-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lapack-static}"
RDEPENDS:lapack-static = " \
 lapack-devel \
"

URI_lapack64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack64-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lapack64}"
RDEPENDS:lapack64 = " \
 glibc \
 blas64 \
 libgcc \
 libgfortran \
"

URI_lapack64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack64_-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lapack64_}"
RDEPENDS:lapack64_ = " \
 glibc \
 blas64_ \
 libgcc \
 libgfortran \
"

URI_blas-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/blas-static-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_blas-static}"
RDEPENDS:blas-static = " \
 blas-devel \
"
