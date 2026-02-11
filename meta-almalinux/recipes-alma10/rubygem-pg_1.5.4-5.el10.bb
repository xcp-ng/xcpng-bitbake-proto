
PN = "rubygem-pg"
PE = "0"
PV = "1.5.4"
PR = "5.el10"
PACKAGES = "rubygem-pg rubygem-pg-doc"


URI_rubygem-pg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-pg-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-pg = "
 libpq
 rubygems
 ruby-libs
 rubygem-bigdecimal
 glibc
 rubygem-json
"

URI_rubygem-pg-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-pg-doc-1.5.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-pg-doc = "
 rubygem-pg
"
