
inherit dnf-bridge

PN = "fftw"
PE = "0"
PV = "3.3.10"
PR = "15.el10"
PACKAGES = "fftw fftw-devel fftw-libs fftw-libs-double fftw-libs-long fftw-libs-quad fftw-libs-single fftw-openmpi-devel fftw-openmpi-libs fftw-openmpi-libs-double fftw-openmpi-libs-long fftw-openmpi-libs-single fftw-openmpi-static fftw-static fftw-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/fftw-3.3.10-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fftw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw}"
RDEPENDS:fftw = " \
 fftw-libs-single \
 glibc \
 fftw-libs-double \
 fftw-libs-long \
 fftw-libs-quad \
"

URI_fftw-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-devel-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-devel}"
RDEPENDS:fftw-devel = " \
 fftw \
 fftw-libs \
 pkgconf-pkg-config \
"

URI_fftw-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-libs}"
RDEPENDS:fftw-libs = " \
 fftw-libs-single \
 fftw-libs-double \
 fftw-libs-long \
 fftw-libs-quad \
"

URI_fftw-libs-double = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-double-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-libs-double}"
RDEPENDS:fftw-libs-double = " \
 glibc \
 libgcc \
 libgomp \
"

URI_fftw-libs-long = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-long-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-libs-long}"
RDEPENDS:fftw-libs-long = " \
 glibc \
 libgcc \
 libgomp \
"

URI_fftw-libs-quad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-quad-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-libs-quad}"
RDEPENDS:fftw-libs-quad = " \
 glibc \
 libgcc \
 libquadmath \
 libgomp \
"

URI_fftw-libs-single = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-single-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-libs-single}"
RDEPENDS:fftw-libs-single = " \
 glibc \
 libgcc \
 libgomp \
"

URI_fftw-openmpi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-devel-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-devel}"
RDEPENDS:fftw-openmpi-devel = " \
 openmpi-devel \
 fftw-openmpi-libs \
 fftw-devel \
 pkgconf-pkg-config \
"

URI_fftw-openmpi-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-libs}"
RDEPENDS:fftw-openmpi-libs = " \
 fftw-openmpi-libs-double \
 fftw-openmpi-libs-long \
 fftw-openmpi-libs-single \
"

URI_fftw-openmpi-libs-double = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-double-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-libs-double}"
RDEPENDS:fftw-openmpi-libs-double = " \
 glibc \
 fftw-libs-double \
 openmpi \
"

URI_fftw-openmpi-libs-long = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-long-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-libs-long}"
RDEPENDS:fftw-openmpi-libs-long = " \
 glibc \
 fftw-libs-long \
 openmpi \
"

URI_fftw-openmpi-libs-single = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-single-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-libs-single}"
RDEPENDS:fftw-openmpi-libs-single = " \
 glibc \
 fftw-libs-single \
 openmpi \
"

URI_fftw-openmpi-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-static-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-openmpi-static}"
RDEPENDS:fftw-openmpi-static = " \
 fftw-openmpi-devel \
 fftw-static \
"

URI_fftw-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-static-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fftw-static}"
RDEPENDS:fftw-static = " \
 fftw-devel \
"

URI_fftw-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fftw-doc-3.3.10-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fftw-doc}"
RDEPENDS:fftw-doc = ""
