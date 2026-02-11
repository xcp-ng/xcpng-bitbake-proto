
inherit dnf-bridge

PN = "yara"
PE = "0"
PV = "4.5.2"
PR = "2.el10"
PACKAGES = "yara yara-devel yara-doc"


URI_yara = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yara-4.5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yara = " \
 jansson \
 openssl-libs \
 glibc \
 protobuf-c \
 file-libs \
"

URI_yara-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yara-devel-4.5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yara-devel = " \
 yara \
 pkgconf-pkg-config \
 openssl-devel \
 jansson-devel \
 protobuf-c-devel \
"

URI_yara-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yara-doc-4.5.2-2.el10.noarch.rpm;unpack=0"
RDEPENDS:yara-doc = ""
