
PN = "nss"
PE = "0"
PV = "3.112.0"
PR = "4.el10_0"
PACKAGES = "nspr nspr-devel nss nss-devel nss-softokn nss-softokn-devel nss-softokn-freebl nss-softokn-freebl-devel nss-sysinit nss-tools nss-util nss-util-devel nss-pkcs11-devel"


URI_nspr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nspr-4.36.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nspr = " \
 glibc \
"

URI_nspr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nspr-devel-4.36.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nspr-devel = " \
 bash \
 pkgconf-pkg-config \
 nspr \
"

URI_nss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss = " \
 crypto-policies \
 nss-softokn \
 p11-kit-trust \
 nss-sysinit \
 nss-util \
 bash \
 glibc \
 nspr \
"

URI_nss-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-devel-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-devel = " \
 nspr-devel \
 nss \
 nss-softokn-devel \
 pkgconf-pkg-config \
 bash \
 nss-util-devel \
"

URI_nss-softokn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-softokn-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-softokn = " \
 nss-softokn-freebl \
 sqlite-libs \
 nss-util \
 glibc \
 nspr \
"

URI_nss-softokn-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-softokn-devel-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-softokn-devel = " \
 nspr-devel \
 nss-softokn \
 pkgconf-pkg-config \
 nss-softokn-freebl-devel \
 bash \
 nss-util-devel \
"

URI_nss-softokn-freebl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-softokn-freebl-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-softokn-freebl = " \
 glibc \
 nss-util \
 bash \
 nspr \
"

URI_nss-softokn-freebl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-softokn-freebl-devel-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-softokn-freebl-devel = " \
 nss-softokn-freebl \
"

URI_nss-sysinit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-sysinit-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-sysinit = " \
 glibc \
 nss \
 bash \
 nss-util \
 sed \
 coreutils \
 nspr \
"

URI_nss-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-tools-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-tools = " \
 zlib-ng-compat \
 nss \
 nss-util \
 glibc \
 nspr \
"

URI_nss-util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-util-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-util = " \
 glibc \
 nspr \
"

URI_nss-util-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-util-devel-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-util-devel = " \
 nspr-devel \
 nss-util \
 bash \
 pkgconf-pkg-config \
"

URI_nss-pkcs11-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nss-pkcs11-devel-3.112.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss-pkcs11-devel = " \
 nss-softokn-freebl-devel \
 nss-devel \
"
