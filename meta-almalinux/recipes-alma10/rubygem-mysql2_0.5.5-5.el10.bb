
PN = "rubygem-mysql2"
PE = "0"
PV = "0.5.5"
PR = "5.el10"
PACKAGES = "rubygem-mysql2 rubygem-mysql2-doc"


URI_rubygem-mysql2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-mysql2-0.5.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-mysql2 = "
 rubygems
 mariadb-connector-c
 ruby-libs
 rubygem-bigdecimal
 glibc
"

URI_rubygem-mysql2-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-mysql2-doc-0.5.5-5.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-mysql2-doc = "
 rubygem-mysql2
"
