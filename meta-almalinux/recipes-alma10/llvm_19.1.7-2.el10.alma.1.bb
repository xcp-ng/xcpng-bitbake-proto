
PN = "llvm"
PE = "0"
PV = "19.1.7"
PR = "2.el10.alma.1"
PACKAGES = "clang clang-analyzer clang-devel clang-libs clang-resource-filesystem clang-tools-extra compiler-rt git-clang-format libomp libomp-devel lld lld-devel lld-libs lldb lldb-devel llvm llvm-devel llvm-doc llvm-googletest llvm-libs llvm-static llvm-test llvm-toolset python3-lldb clang-tools-extra-devel llvm-cmake-utils python3-clang python3-lit"


URI_clang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang = " \
 libgcc \
 clang-libs \
 libstdc++-devel \
 libstdc++ \
 glibc \
 llvm-libs \
 gcc-c++ \
"

URI_clang-analyzer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-analyzer-19.1.7-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:clang-analyzer = " \
 python3 \
 perl-libs \
 perl-FindBin \
 perl-Text-ParseWords \
 clang \
 perl-File-Basename \
 perl-File-Temp \
 perl-File-Copy \
 perl-PathTools \
 perl-Sys-Hostname \
 perl-Term-ANSIColor \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-Hash-Util \
 perl-lib \
"

URI_clang-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang-devel = " \
 cmake-filesystem \
 clang \
 libgcc \
 clang-libs \
 clang-tools-extra \
 libstdc++ \
 glibc \
"

URI_clang-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-libs-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang-libs = " \
 libgcc \
 clang-resource-filesystem \
 libstdc++ \
 glibc \
 llvm-libs \
"

URI_clang-resource-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-resource-filesystem-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang-resource-filesystem = ""

URI_clang-tools-extra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clang-tools-extra-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang-tools-extra = " \
 python3 \
 emacs-filesystem \
 libgcc \
 libxml2 \
 clang-libs \
 libstdc++ \
 glibc \
 llvm-libs \
"

URI_compiler-rt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/compiler-rt-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:compiler-rt = " \
 python3 \
 libgcc \
 clang-resource-filesystem \
 libstdc++ \
 glibc \
"

URI_git-clang-format = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-clang-format-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-clang-format = " \
 python3 \
 git \
 clang-tools-extra \
"

URI_libomp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libomp-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libomp = " \
 libffi \
 libgcc \
 elfutils-libelf \
 libstdc++ \
 glibc \
 llvm-libs \
"

URI_libomp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libomp-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libomp-devel = " \
 libomp \
 clang-resource-filesystem \
"

URI_lld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lld-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lld = " \
 libgcc \
 lld-libs \
 libstdc++ \
 bash \
 glibc \
 alternatives \
 llvm-libs \
"

URI_lld-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lld-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lld-devel = " \
 lld \
 lld-libs \
 cmake-filesystem \
"

URI_lld-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lld-libs-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lld-libs = " \
 zlib-ng-compat \
 libgcc \
 libzstd \
 libstdc++ \
 glibc \
 llvm-libs \
"

URI_lldb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldb-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldb = " \
 zlib-ng-compat \
 libgcc \
 libxml2 \
 python3-libs \
 clang-libs \
 libstdc++ \
 ncurses-libs \
 python3-lldb \
 glibc \
 llvm-libs \
 xz-libs \
 libedit \
"

URI_lldb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldb-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldb-devel = " \
 lldb \
"

URI_llvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm = " \
 python3 \
 zlib-ng-compat \
 libgcc \
 libzstd \
 libstdc++ \
 glibc \
 llvm-libs \
"

URI_llvm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-devel = " \
 cmake-filesystem \
 libedit-devel \
 libgcc \
 libzstd-devel \
 llvm \
 libstdc++ \
 bash \
 glibc \
 alternatives \
 llvm-googletest \
 llvm-libs \
 llvm-static \
 llvm-test \
"

URI_llvm-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-doc-19.1.7-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:llvm-doc = " \
 llvm \
"

URI_llvm-googletest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-googletest-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-googletest = ""

URI_llvm-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-libs-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-libs = " \
 zlib-ng-compat \
 libffi \
 libgcc \
 libxml2 \
 libzstd \
 libstdc++ \
 glibc \
 libedit \
"

URI_llvm-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-static-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-static = ""

URI_llvm-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-test-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-test = " \
 libgcc \
 llvm-libs \
 libstdc++ \
 glibc \
 llvm \
"

URI_llvm-toolset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llvm-toolset-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-toolset = " \
 llvm \
 clang \
 lld \
"

URI_python3-lldb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-lldb-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-lldb = " \
 python3 \
 lldb \
"

URI_clang-tools-extra-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/clang-tools-extra-devel-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clang-tools-extra-devel = " \
 clang-tools-extra \
"

URI_llvm-cmake-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/llvm-cmake-utils-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:llvm-cmake-utils = ""

URI_python3-clang = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-clang-19.1.7-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-clang = " \
 python3 \
 clang-devel \
"

URI_python3-lit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-lit-19.1.7-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:python3-lit = " \
 python3 \
 python3-setuptools \
"
