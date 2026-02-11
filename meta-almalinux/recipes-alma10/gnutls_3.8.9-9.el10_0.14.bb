
PN = "gnutls"
PE = "0"
PV = "3.8.9"
PR = "9.el10_0.14"
PACKAGES = "gnutls gnutls-c++ gnutls-dane gnutls-devel gnutls-fips gnutls-utils"


URI_gnutls = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gnutls-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls = "
 crypto-policies
 p11-kit
 p11-kit-trust
 libtasn1
 glibc
 libidn2
 libunistring
"

URI_gnutls-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-c++-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-c++ = "
 gnutls
 libgcc
 p11-kit
 libstdc++
 libtasn1
 glibc
 libidn2
 libunistring
"

URI_gnutls-dane = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-dane-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-dane = "
 gnutls
 p11-kit
 unbound-libs
 libtasn1
 glibc
 libidn2
 libunistring
"

URI_gnutls-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-devel-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-devel = "
 p11-kit-devel
 gnutls-c++
 gnutls
 gnutls-dane
 gnutls-devel
 libidn2-devel
 pkgconf-pkg-config
 libtasn1-devel
"

URI_gnutls-fips = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-fips-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-fips = "
 gnutls
"

URI_gnutls-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-utils-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-utils = "
 glibc
 gnutls
 libtasn1
 gnutls-dane
"
