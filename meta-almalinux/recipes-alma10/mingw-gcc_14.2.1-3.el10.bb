
inherit dnf-bridge

PN = "mingw-gcc"
PE = "0"
PV = "14.2.1"
PR = "3.el10"
PACKAGES = "mingw32-cpp mingw32-gcc mingw32-gcc-c++ mingw32-libgcc mingw32-libstdc++ mingw64-cpp mingw64-gcc mingw64-gcc-c++ mingw64-libgcc mingw64-libstdc++ mingw32-gcc-gfortran mingw32-gcc-objc++ mingw32-gcc-objc mingw32-gcc-plugin-devel mingw32-libgomp mingw64-gcc-gfortran mingw64-gcc-objc++ mingw64-gcc-objc mingw64-gcc-plugin-devel mingw64-libgomp ucrt64-cpp ucrt64-gcc ucrt64-gcc-c++ ucrt64-gcc-gfortran ucrt64-gcc-objc++ ucrt64-gcc-objc ucrt64-gcc-plugin-devel ucrt64-libgcc ucrt64-libgomp ucrt64-libstdc++"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/mingw-gcc-14.2.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw32-cpp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-cpp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-cpp}"
RDEPENDS:mingw32-cpp = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libmpc \
 libstdc++ \
 mingw32-filesystem \
 glibc \
"

URI_mingw32-gcc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc}"
RDEPENDS:mingw32-gcc = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 mingw32-winpthreads-static \
 libgcc \
 libmpc \
 libstdc++ \
 bash \
 mingw32-crt \
 mingw32-binutils \
 mingw32-cpp \
 glibc \
 mingw32-headers \
 mingw32-libgcc \
"

URI_mingw32-gcc-c++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gcc-c++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc-c++}"
RDEPENDS:mingw32-gcc-c++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libmpc \
 libstdc++ \
 mingw32-gcc \
 glibc \
"

URI_mingw32-libgcc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-libgcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-libgcc}"
RDEPENDS:mingw32-libgcc = " \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-winpthreads \
"

URI_mingw32-libstdc++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-libstdc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-libstdc++}"
RDEPENDS:mingw32-libstdc++ = " \
 mingw32-filesystem \
 mingw32-crt \
 mingw32-winpthreads \
 mingw32-libgcc \
"

URI_mingw64-cpp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-cpp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-cpp}"
RDEPENDS:mingw64-cpp = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 mingw64-filesystem \
 libmpc \
 libstdc++ \
 glibc \
"

URI_mingw64-gcc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc}"
RDEPENDS:mingw64-gcc = " \
 mingw64-winpthreads-static \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 mingw64-binutils \
 mingw64-crt \
 mingw64-cpp \
 libmpc \
 libstdc++ \
 bash \
 mingw64-headers \
 mingw64-libgcc \
 glibc \
"

URI_mingw64-gcc-c++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gcc-c++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc-c++}"
RDEPENDS:mingw64-gcc-c++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 mingw64-gcc \
 libmpc \
 libstdc++ \
 glibc \
"

URI_mingw64-libgcc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-libgcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-libgcc}"
RDEPENDS:mingw64-libgcc = " \
 mingw64-crt \
 mingw64-filesystem \
 mingw64-winpthreads \
"

URI_mingw64-libstdc++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-libstdc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-libstdc++}"
RDEPENDS:mingw64-libstdc++ = " \
 mingw64-filesystem \
 mingw64-crt \
 mingw64-winpthreads \
 mingw64-libgcc \
"

URI_mingw32-gcc-gfortran = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-gcc-gfortran-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc-gfortran}"
RDEPENDS:mingw32-gcc-gfortran = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 mingw32-winpthreads \
 libgcc \
 libmpc \
 libstdc++ \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-gcc \
 glibc \
 mingw32-libgcc \
"

URI_mingw32-gcc-objc++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-gcc-objc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc-objc++}"
RDEPENDS:mingw32-gcc-objc++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libmpc \
 mingw32-gcc-c++ \
 libstdc++ \
 mingw32-gcc-objc \
 glibc \
"

URI_mingw32-gcc-objc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-gcc-objc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc-objc}"
RDEPENDS:mingw32-gcc-objc = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 mingw32-winpthreads \
 libgcc \
 libmpc \
 libstdc++ \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-gcc \
 glibc \
 mingw32-libgcc \
"

URI_mingw32-gcc-plugin-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-gcc-plugin-devel-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-gcc-plugin-devel}"
RDEPENDS:mingw32-gcc-plugin-devel = " \
 libgcc \
 libmpc-devel \
 libstdc++ \
 mingw32-gcc \
 glibc \
 mpfr-devel \
 gmp-devel \
"

URI_mingw32-libgomp = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-libgomp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw32-libgomp}"
RDEPENDS:mingw32-libgomp = " \
 mingw32-winpthreads \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-gcc \
 mingw32-libgcc \
"

URI_mingw64-gcc-gfortran = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-gcc-gfortran-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc-gfortran}"
RDEPENDS:mingw64-gcc-gfortran = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 mingw64-crt \
 mingw64-filesystem \
 mingw64-gcc \
 libmpc \
 libstdc++ \
 mingw64-libgcc \
 glibc \
 mingw64-winpthreads \
"

URI_mingw64-gcc-objc++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-gcc-objc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc-objc++}"
RDEPENDS:mingw64-gcc-objc++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libmpc \
 mingw64-gcc-c++ \
 libstdc++ \
 glibc \
 mingw64-gcc-objc \
"

URI_mingw64-gcc-objc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-gcc-objc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc-objc}"
RDEPENDS:mingw64-gcc-objc = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 mingw64-crt \
 mingw64-filesystem \
 mingw64-gcc \
 libmpc \
 libstdc++ \
 mingw64-libgcc \
 glibc \
 mingw64-winpthreads \
"

URI_mingw64-gcc-plugin-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-gcc-plugin-devel-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-gcc-plugin-devel}"
RDEPENDS:mingw64-gcc-plugin-devel = " \
 libgcc \
 mingw64-gcc \
 libmpc-devel \
 libstdc++ \
 glibc \
 mpfr-devel \
 gmp-devel \
"

URI_mingw64-libgomp = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-libgomp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw64-libgomp}"
RDEPENDS:mingw64-libgomp = " \
 mingw64-crt \
 mingw64-filesystem \
 mingw64-gcc \
 mingw64-libgcc \
 mingw64-winpthreads \
"

URI_ucrt64-cpp = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-cpp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-cpp}"
RDEPENDS:ucrt64-cpp = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-filesystem \
 libgcc \
 libmpc \
 libstdc++ \
 glibc \
"

URI_ucrt64-gcc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc}"
RDEPENDS:ucrt64-gcc = " \
 ucrt64-binutils \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-crt \
 ucrt64-cpp \
 libgcc \
 ucrt64-headers \
 ucrt64-libgcc \
 libmpc \
 ucrt64-winpthreads-static \
 libstdc++ \
 bash \
 glibc \
"

URI_ucrt64-gcc-c++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-c++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc-c++}"
RDEPENDS:ucrt64-gcc-c++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-gcc \
 libgcc \
 libmpc \
 libstdc++ \
 glibc \
"

URI_ucrt64-gcc-gfortran = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-gfortran-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc-gfortran}"
RDEPENDS:ucrt64-gcc-gfortran = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-crt \
 ucrt64-filesystem \
 ucrt64-gcc \
 libgcc \
 ucrt64-libgcc \
 ucrt64-winpthreads \
 libmpc \
 libstdc++ \
 glibc \
"

URI_ucrt64-gcc-objc++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-objc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc-objc++}"
RDEPENDS:ucrt64-gcc-objc++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-gcc-c++ \
 ucrt64-gcc-objc \
 libgcc \
 libmpc \
 libstdc++ \
 glibc \
"

URI_ucrt64-gcc-objc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-objc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc-objc}"
RDEPENDS:ucrt64-gcc-objc = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 ucrt64-crt \
 ucrt64-filesystem \
 ucrt64-gcc \
 libgcc \
 ucrt64-libgcc \
 ucrt64-winpthreads \
 libmpc \
 libstdc++ \
 glibc \
"

URI_ucrt64-gcc-plugin-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-gcc-plugin-devel-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-gcc-plugin-devel}"
RDEPENDS:ucrt64-gcc-plugin-devel = " \
 ucrt64-gcc \
 libgcc \
 libmpc-devel \
 libstdc++ \
 glibc \
 mpfr-devel \
 gmp-devel \
"

URI_ucrt64-libgcc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-libgcc-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-libgcc}"
RDEPENDS:ucrt64-libgcc = " \
 ucrt64-crt \
 ucrt64-filesystem \
 ucrt64-winpthreads \
"

URI_ucrt64-libgomp = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-libgomp-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-libgomp}"
RDEPENDS:ucrt64-libgomp = " \
 ucrt64-crt \
 ucrt64-filesystem \
 ucrt64-gcc \
 ucrt64-libgcc \
 ucrt64-winpthreads \
"

URI_ucrt64-libstdc++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-libstdc++-14.2.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-libstdc++}"
RDEPENDS:ucrt64-libstdc++ = " \
 ucrt64-filesystem \
 ucrt64-crt \
 ucrt64-libgcc \
 ucrt64-winpthreads \
"
