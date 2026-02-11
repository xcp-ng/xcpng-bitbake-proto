
PN = "bcc"
PE = "0"
PV = "0.32.0"
PR = "1.el10"
PACKAGES = "bcc bcc-tools libbpf-tools python3-bcc bcc-devel bcc-doc"


URI_bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcc-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc = " \
 elfutils-debuginfod-client \
 libgcc \
 libbpf \
 tar \
 elfutils-libelf \
 clang-libs \
 libstdc++ \
 glibc \
 llvm-libs \
 xz-libs \
"

URI_bcc-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcc-tools-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc-tools = " \
 python3 \
 python3-bcc \
 libbpf \
 bash \
 bcc \
 glibc \
 python3-netaddr \
"

URI_libbpf-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbpf-tools-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbpf-tools = " \
 glibc \
 zlib-ng-compat \
 elfutils-libelf \
"

URI_python3-bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-bcc-0.32.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-bcc = " \
 python3 \
 bcc \
"

URI_bcc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcc-devel-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc-devel = " \
 pkgconf-pkg-config \
 bcc \
"

URI_bcc-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcc-doc-0.32.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:bcc-doc = ""
