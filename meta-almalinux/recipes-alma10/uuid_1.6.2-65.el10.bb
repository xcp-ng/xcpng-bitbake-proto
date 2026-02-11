
PN = "uuid"
PE = "0"
PV = "1.6.2"
PR = "65.el10"
PACKAGES = "uuid uuid-c++ uuid-dce uuid-devel uuid-c++-devel uuid-dce-devel uuid-perl"


URI_uuid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid = "
 glibc
"

URI_uuid-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-c++-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-c++ = "
 glibc
 libgcc
 libstdc++
 uuid
"

URI_uuid-dce = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-dce-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-dce = "
 glibc
 uuid
"

URI_uuid-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uuid-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-devel = "
 bash
 pkgconf-pkg-config
 uuid
"

URI_uuid-c++-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-c++-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-c++-devel = "
 uuid-devel
 uuid-c++
"

URI_uuid-dce-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-dce-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-dce-devel = "
 uuid-dce
 uuid-devel
"

URI_uuid-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-perl-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-perl = "
 perl-libs
 perl-Carp
 uuid
 perl-Data-UUID
 perl-Tie
 glibc
 perl-Exporter
"
