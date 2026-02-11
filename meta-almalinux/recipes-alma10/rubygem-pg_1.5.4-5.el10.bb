
PN = "rubygem-pg"
PE = "0"
PV = "1.5.4"
PR = "5.el10"
PACKAGES = "rubygem-pg rubygem-pg-doc"


URI_rubygem-pg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-pg-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-pg = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) ruby(rubygems) ( ) libruby.so.3.3()(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) rubygem(bigdecimal) ( ) rubygem(json) ( ) libpq.so.5(RHPG_10)(64bit) ( ) libpq.so.5(RHPG_14)(64bit) ( ) libpq.so.5(RHPG_12)(64bit) ( )"
RPROVIDES:rubygem-pg = "rubygem(pg) ( =  1.5.4) rubygem-pg ( =  1.5.4-5.el10) rubygem-pg(x86-64) ( =  1.5.4-5.el10)"

URI_rubygem-pg-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-pg-doc-1.5.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-pg-doc = "rubygem-pg ( =  1.5.4-5.el10)"
RPROVIDES:rubygem-pg-doc = "rubygem-pg-doc ( =  1.5.4-5.el10)"
