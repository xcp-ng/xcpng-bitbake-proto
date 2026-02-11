
PN = "uuid"
PE = "0"
PV = "1.6.2"
PR = "65.el10"
PACKAGES = "uuid uuid-c++ uuid-dce uuid-devel uuid-c++-devel uuid-dce-devel uuid-perl"


URI_uuid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:uuid = "libossp-uuid.so.16()(64bit) ( ) uuid ( =  1.6.2-65.el10) uuid(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-c++-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-c++ = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) uuid ( =  1.6.2-65.el10)"
RPROVIDES:uuid-c++ = "libossp-uuid++.so.16()(64bit) ( ) uuid-c++ ( =  1.6.2-65.el10) uuid-c++(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-dce = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuid-dce-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-dce = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) uuid ( =  1.6.2-65.el10)"
RPROVIDES:uuid-dce = "libossp-uuid_dce.so.16()(64bit) ( ) uuid-dce ( =  1.6.2-65.el10) uuid-dce(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uuid-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) /usr/bin/sh ( ) libossp-uuid.so.16()(64bit) ( ) uuid ( =  1.6.2-65.el10)"
RPROVIDES:uuid-devel = "pkgconfig(ossp-uuid) ( =  1.6.2) uuid-devel ( =  1.6.2-65.el10) uuid-devel(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-c++-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-c++-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-c++-devel = "libossp-uuid++.so.16()(64bit) ( ) uuid-devel ( =  1.6.2-65.el10) uuid-c++ ( =  1.6.2-65.el10)"
RPROVIDES:uuid-c++-devel = "uuid-c++-devel ( =  1.6.2-65.el10) uuid-c++-devel(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-dce-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-dce-devel-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-dce-devel = "libossp-uuid_dce.so.16()(64bit) ( ) uuid-devel ( =  1.6.2-65.el10) uuid-dce ( =  1.6.2-65.el10)"
RPROVIDES:uuid-dce-devel = "uuid-dce-devel ( =  1.6.2-65.el10) uuid-dce-devel(x86-64) ( =  1.6.2-65.el10)"

URI_uuid-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/uuid-perl-1.6.2-65.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uuid-perl = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl-libs ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libperl.so.5.40()(64bit) ( ) perl(Tie::Scalar) ( ) perl(Data::UUID) ( ) libossp-uuid.so.16()(64bit) ( ) perl(:VERSION) ( >=  5.8.0) uuid ( =  1.6.2-65.el10)"
RPROVIDES:uuid-perl = "perl(OSSP::uuid::tie) ( ) perl(OSSP::uuid) ( =  1.6.2) uuid-perl ( =  1.6.2-65.el10) uuid-perl(x86-64) ( =  1.6.2-65.el10)"
