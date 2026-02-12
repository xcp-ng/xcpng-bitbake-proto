
inherit dnf-bridge

PN = "cryptsetup"
PE = "0"
PV = "2.7.5"
PR = "2.el10"
PACKAGES = "cryptsetup cryptsetup-libs integritysetup veritysetup cryptsetup-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/cryptsetup-2.7.5-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cryptsetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cryptsetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cryptsetup}"
RDEPENDS:cryptsetup = " \
 libuuid \
 cryptsetup-libs \
 libpwquality \
 libblkid \
 popt \
 glibc \
"

URI_cryptsetup-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cryptsetup-libs-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cryptsetup-libs}"
RDEPENDS:cryptsetup-libs = " \
 libuuid \
 device-mapper-libs \
 libblkid \
 openssl-libs \
 json-c \
 glibc \
"

URI_integritysetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/integritysetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_integritysetup}"
RDEPENDS:integritysetup = " \
 libuuid \
 cryptsetup-libs \
 libblkid \
 popt \
 glibc \
"

URI_veritysetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/veritysetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_veritysetup}"
RDEPENDS:veritysetup = " \
 glibc \
 cryptsetup-libs \
 popt \
"

URI_cryptsetup-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cryptsetup-devel-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cryptsetup-devel}"
RDEPENDS:cryptsetup-devel = " \
 libblkid-devel \
 cryptsetup-libs \
 pkgconf-pkg-config \
 libuuid-devel \
 openssl-devel \
 device-mapper-devel \
 json-c-devel \
"
