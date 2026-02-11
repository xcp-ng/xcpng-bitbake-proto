
inherit dnf-bridge

PN = "libvoikko"
PE = "0"
PV = "4.3.2"
PR = "8.el10"
PACKAGES = "libvoikko python3-libvoikko libvoikko-devel voikko-tools"


URI_libvoikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvoikko-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvoikko = " \
 glibc \
 voikko-fi \
 libgcc \
 libstdc++ \
"

URI_python3-libvoikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libvoikko-4.3.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-libvoikko = " \
 python3 \
 libvoikko \
"

URI_libvoikko-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvoikko-devel-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvoikko-devel = " \
 pkgconf-pkg-config \
 libvoikko \
"

URI_voikko-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/voikko-tools-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:voikko-tools = " \
 glibc \
 libgcc \
 libstdc++ \
 libvoikko \
"
