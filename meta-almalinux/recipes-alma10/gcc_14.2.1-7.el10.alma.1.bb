
PN = "gcc"
PE = "0"
PV = "14.2.1"
PR = "7.el10.alma.1"
PACKAGES = "libatomic libgcc libgfortran libgomp libquadmath libstdc++ cpp gcc gcc-c++ gcc-gfortran gcc-offload-amdgcn gcc-offload-nvptx gcc-plugin-annobin libasan libgccjit libgccjit-devel libgomp-offload-amdgcn libgomp-offload-nvptx libhwasan libitm libitm-devel liblsan libquadmath-devel libstdc++-devel libstdc++-docs libtsan libubsan gcc-plugin-devel libgfortran-static libquadmath-static libstdc++-static gcc-gdb-plugin libasan-static libatomic-static libhwasan-static libitm-static liblsan-static libtsan-static libubsan-static"


URI_libatomic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libatomic-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic = " \
 glibc \
"

URI_libgcc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcc-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcc = ""

URI_libgfortran = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgfortran-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgfortran = " \
 glibc \
 libgcc \
"

URI_libgomp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgomp-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp = " \
 glibc \
"

URI_libquadmath = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libquadmath-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath = " \
 glibc \
 libgcc \
"

URI_libstdc++ = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libstdc++-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++ = " \
 glibc \
 libgcc \
"

URI_cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cpp-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cpp = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libzstd \
 libmpc \
 glibc \
 filesystem \
"

URI_gcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 cpp \
 glibc-devel \
 libgcc \
 make \
 libgomp \
 libzstd \
 libmpc \
 bash \
 binutils \
 glibc \
"

URI_gcc-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-c++-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-c++ = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libstdc++-devel \
 libzstd \
 libmpc \
 libstdc++ \
 gcc \
 glibc \
"

URI_gcc-gfortran = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-gfortran-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-gfortran = " \
 libquadmath-devel \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgfortran \
 libquadmath \
 libzstd \
 libmpc \
 gcc \
 glibc \
"

URI_gcc-offload-amdgcn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-offload-amdgcn-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-offload-amdgcn = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libgomp-offload-amdgcn \
 libzstd \
 libmpc \
 lld \
 libstdc++ \
 gcc \
 glibc \
 llvm \
"

URI_gcc-offload-nvptx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-offload-nvptx-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-offload-nvptx = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libgcc \
 libgomp-offload-nvptx \
 libzstd \
 libmpc \
 libstdc++ \
 gcc \
 glibc \
"

URI_gcc-plugin-annobin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-plugin-annobin-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-plugin-annobin = " \
 glibc \
 libgcc \
 libstdc++ \
 gcc \
"

URI_libasan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libasan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasan = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libgccjit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgccjit-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgccjit = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 libzstd \
 libmpc \
 gcc \
 glibc \
"

URI_libgccjit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgccjit-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgccjit-devel = " \
 libgccjit \
"

URI_libgomp-offload-amdgcn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgomp-offload-amdgcn-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp-offload-amdgcn = " \
 glibc \
 libgomp \
"

URI_libgomp-offload-nvptx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgomp-offload-nvptx-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp-offload-nvptx = " \
 glibc \
 libgcc \
 libgomp \
"

URI_libhwasan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhwasan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhwasan = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libitm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libitm-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm = " \
 glibc \
"

URI_libitm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libitm-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm-devel = " \
 libitm \
 gcc \
"

URI_liblsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblsan = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libquadmath-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libquadmath-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath-devel = " \
 libquadmath \
 gcc \
"

URI_libstdc++-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstdc++-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-devel = " \
 libstdc++ \
"

URI_libstdc++-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstdc++-docs-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-docs = ""

URI_libtsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtsan = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libubsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libubsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libubsan = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_gcc-plugin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gcc-plugin-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-plugin-devel = " \
 libmpc-devel \
 gcc \
 glibc \
 mpfr-devel \
 gmp-devel \
"

URI_libgfortran-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgfortran-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgfortran-static = " \
 libquadmath-static \
 libgfortran \
 gcc \
"

URI_libquadmath-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libquadmath-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath-static = " \
 libquadmath-devel \
"

URI_libstdc++-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libstdc++-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-static = " \
 libstdc++-devel \
"

URI_gcc-gdb-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gcc-gdb-plugin-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-gdb-plugin = " \
 glibc \
 libgcc \
 libstdc++ \
 gcc \
"

URI_libasan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libasan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasan-static = " \
 libasan \
"

URI_libatomic-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libatomic-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic-static = " \
 libatomic \
"

URI_libhwasan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libhwasan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhwasan-static = " \
 libhwasan \
"

URI_libitm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libitm-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm-static = " \
 libitm-devel \
"

URI_liblsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblsan-static = " \
 liblsan \
"

URI_libtsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtsan-static = " \
 libtsan \
"

URI_libubsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libubsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libubsan-static = " \
 libubsan \
"
