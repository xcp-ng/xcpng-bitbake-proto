
inherit dnf-bridge

PN = "libpinyin"
PE = "0"
PV = "2.8.1"
PR = "9.el10"
PACKAGES = "libpinyin libpinyin-data libzhuyin libpinyin-devel libpinyin-tools"


URI_libpinyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpinyin-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin = " \
 kyotocabinet-libs \
 libgcc \
 libstdc++ \
 glib2 \
 libpinyin-data \
 glibc \
"

URI_libpinyin-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpinyin-data-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-data = " \
 libpinyin \
"

URI_libzhuyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzhuyin-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzhuyin = " \
 kyotocabinet-libs \
 libgcc \
 libstdc++ \
 glib2 \
 libpinyin \
 glibc \
"

URI_libpinyin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpinyin-devel-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-devel = " \
 libzhuyin \
 glib2-devel \
 pkgconf-pkg-config \
 libpinyin \
"

URI_libpinyin-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpinyin-tools-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-tools = " \
 kyotocabinet-libs \
 libgcc \
 libstdc++ \
 glib2 \
 libpinyin \
 glibc \
"
