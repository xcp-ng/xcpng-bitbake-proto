
inherit dnf-bridge

PN = "gdb"
PE = "0"
PV = "14.2"
PR = "4.1.el10_0"
PACKAGES = "gdb gdb-doc gdb-gdbserver gdb-headless gdb-minimal"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gdb-14.2-4.1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdb-14.2-4.1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdb}"
RDEPENDS:gdb = " \
 gdb-headless \
 bash \
"

URI_gdb-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdb-doc-14.2-4.1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_gdb-doc}"
RDEPENDS:gdb-doc = ""

URI_gdb-gdbserver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdb-gdbserver-14.2-4.1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdb-gdbserver}"
RDEPENDS:gdb-gdbserver = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_gdb-headless = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdb-headless-14.2-4.1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdb-headless}"
RDEPENDS:gdb-headless = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 source-highlight \
 libbabeltrace \
 elfutils-debuginfod-client \
 libgcc \
 readline \
 python3-libs \
 libstdc++ \
 bash \
 ncurses-libs \
 libipt \
 expat \
 glibc \
 xz-libs \
"

URI_gdb-minimal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdb-minimal-14.2-4.1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdb-minimal}"
RDEPENDS:gdb-minimal = " \
 gmp \
 zlib-ng-compat \
 mpfr \
 elfutils-debuginfod-client \
 libgcc \
 readline \
 libstdc++ \
 bash \
 ncurses-libs \
 glibc \
 xz-libs \
"
