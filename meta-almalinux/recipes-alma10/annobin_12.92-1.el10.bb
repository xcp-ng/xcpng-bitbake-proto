
inherit dnf-bridge

PN = "annobin"
PE = "0"
PV = "12.92"
PR = "1.el10"
PACKAGES = "annobin-annocheck annobin-docs annobin-libannocheck annobin-plugin-clang annobin-plugin-gcc annobin-plugin-llvm"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/annobin-12.92-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_annobin-annocheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-annocheck-12.92-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_annobin-annocheck}"
RDEPENDS:annobin-annocheck = " \
 elfutils-libelf \
 elfutils-libs \
 glibc \
 rpm \
 cpio \
 rpm-libs \
 annobin-docs \
"

URI_annobin-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-docs-12.92-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_annobin-docs}"
RDEPENDS:annobin-docs = ""

URI_annobin-libannocheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-libannocheck-12.92-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_annobin-libannocheck}"
RDEPENDS:annobin-libannocheck = " \
 glibc \
 pkgconf-pkg-config \
 annobin-docs \
"

URI_annobin-plugin-clang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-clang-12.92-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_annobin-plugin-clang}"
RDEPENDS:annobin-plugin-clang = " \
 libgcc \
 libstdc++ \
 glibc \
 llvm-libs \
 annobin-docs \
"

URI_annobin-plugin-gcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-gcc-12.92-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_annobin-plugin-gcc}"
RDEPENDS:annobin-plugin-gcc = " \
 libgcc \
 libstdc++ \
 gcc \
 glibc \
 annobin-docs \
"

URI_annobin-plugin-llvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-llvm-12.92-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_annobin-plugin-llvm}"
RDEPENDS:annobin-plugin-llvm = " \
 libgcc \
 libstdc++ \
 glibc \
 llvm-libs \
 annobin-docs \
"
