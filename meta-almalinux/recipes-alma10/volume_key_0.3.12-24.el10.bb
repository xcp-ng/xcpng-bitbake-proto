
PN = "volume_key"
PE = "0"
PV = "0.3.12"
PR = "24.el10"
PACKAGES = "python3-volume_key volume_key volume_key-libs volume_key-devel"


URI_python3-volume_key = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-volume_key-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-volume_key = " \
 python3 \
 nss \
 cryptsetup-libs \
 libblkid \
 gpgme \
 nss-util \
 glib2 \
 volume_key-libs \
 glibc \
 nspr \
"

URI_volume_key = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/volume_key-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key = " \
 nss \
 volume_key-libs \
 glib2 \
 glibc \
 nspr \
"

URI_volume_key-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/volume_key-libs-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key-libs = " \
 nss \
 gnupg2 \
 cryptsetup-libs \
 libblkid \
 gpgme \
 nss-util \
 glib2 \
 glibc \
 nspr \
"

URI_volume_key-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/volume_key-devel-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key-devel = " \
 volume_key-libs \
"
