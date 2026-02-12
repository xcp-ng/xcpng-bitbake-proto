
inherit dnf-bridge

PN = "elfutils"
PE = "0"
PV = "0.192"
PR = "6.el10_0"
PACKAGES = "elfutils elfutils-debuginfod-client elfutils-default-yama-scope elfutils-libelf elfutils-libs elfutils-debuginfod elfutils-debuginfod-client-devel elfutils-devel elfutils-libelf-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/elfutils-0.192-6.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_elfutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/elfutils-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils}"
RDEPENDS:elfutils = " \
 libarchive \
 elfutils-debuginfod-client \
 libgcc \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 bash \
 glibc \
"

URI_elfutils-debuginfod-client = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/elfutils-debuginfod-client-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-debuginfod-client}"
RDEPENDS:elfutils-debuginfod-client = " \
 openssl-libs \
 json-c \
 elfutils-libelf \
 elfutils-libs \
 libcurl \
 glibc \
"

URI_elfutils-default-yama-scope = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/elfutils-default-yama-scope-0.192-6.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_elfutils-default-yama-scope}"
RDEPENDS:elfutils-default-yama-scope = " \
 bash \
"

URI_elfutils-libelf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/elfutils-libelf-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-libelf}"
RDEPENDS:elfutils-libelf = " \
 glibc \
 zlib-ng-compat \
 libzstd \
"

URI_elfutils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/elfutils-libs-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-libs}"
RDEPENDS:elfutils-libs = " \
 zlib-ng-compat \
 bzip2-libs \
 elfutils-default-yama-scope \
 elfutils-libelf \
 libzstd \
 glibc \
 xz-libs \
"

URI_elfutils-debuginfod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/elfutils-debuginfod-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-debuginfod}"
RDEPENDS:elfutils-debuginfod = " \
 shadow-utils \
 systemd \
 libarchive \
 bsdtar \
 elfutils-debuginfod-client \
 libgcc \
 json-c \
 libmicrohttpd \
 elfutils-libelf \
 elfutils-libs \
 sqlite-libs \
 libstdc++ \
 bash \
 glibc \
 rpm-libs \
 xz-libs \
"

URI_elfutils-debuginfod-client-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/elfutils-debuginfod-client-devel-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-debuginfod-client-devel}"
RDEPENDS:elfutils-debuginfod-client-devel = " \
 elfutils-debuginfod-client \
 pkgconf-pkg-config \
"

URI_elfutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/elfutils-devel-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-devel}"
RDEPENDS:elfutils-devel = " \
 xz-devel \
 zlib-ng-compat-devel \
 libzstd-devel \
 pkgconf-pkg-config \
 elfutils-libs \
 elfutils-libelf-devel \
"

URI_elfutils-libelf-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/elfutils-libelf-devel-0.192-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_elfutils-libelf-devel}"
RDEPENDS:elfutils-libelf-devel = " \
 zlib-ng-compat-devel \
 libzstd-devel \
 pkgconf-pkg-config \
 elfutils-libelf \
"
