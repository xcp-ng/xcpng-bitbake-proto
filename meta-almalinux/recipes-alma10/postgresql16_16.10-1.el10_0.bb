
PN = "postgresql16"
PE = "0"
PV = "16.10"
PR = "1.el10_0"
PACKAGES = "postgresql postgresql-contrib postgresql-docs postgresql-plperl postgresql-plpython3 postgresql-pltcl postgresql-private-devel postgresql-private-libs postgresql-server postgresql-server-devel postgresql-static postgresql-test postgresql-upgrade postgresql-upgrade-devel postgresql-test-rpm-macros"


URI_postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql = "
 zlib-ng-compat
 lz4-libs
 openssl-libs
 readline
 postgresql-private-libs
 libzstd
 glibc
"

URI_postgresql-contrib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-contrib-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-contrib = "
 zlib-ng-compat
 perl-libs
 libxslt
 lz4-libs
 openssl-libs
 libxml2
 python3-libs
 postgresql-private-libs
 libzstd
 uuid
 glibc
 libselinux
 postgresql
"

URI_postgresql-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-docs-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-docs = "
 glibc
 postgresql
"

URI_postgresql-plperl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-plperl-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-plperl = "
 glibc
 postgresql-server
 perl-libs
"

URI_postgresql-plpython3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-plpython3-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-plpython3 = "
 glibc
 postgresql-server
 python3-libs
"

URI_postgresql-pltcl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-pltcl-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-pltcl = "
 glibc
 postgresql-server
 tcl
"

URI_postgresql-private-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-private-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-private-devel = "
 openssl-devel
 pkgconf-pkg-config
 postgresql-private-libs
"

URI_postgresql-private-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-private-libs-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-private-libs = "
 glibc
 krb5-libs
 openssl-libs
 openldap
"

URI_postgresql-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-server-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-server = "
 shadow-utils
 systemd
 zlib-ng-compat
 systemd-libs
 util-linux
 lz4-libs
 openssl-libs
 libxml2
 postgresql-private-libs
 libzstd
 krb5-libs
 pam-libs
 bash
 glibc
 libicu
 openldap
 postgresql
"

URI_postgresql-server-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-server-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-server-devel = "
 libicu-devel
 postgresql-private-devel
 postgresql-private-libs
 bash
 glibc
 krb5-devel
"

URI_postgresql-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-static-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-static = "
 postgresql-server-devel
"

URI_postgresql-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-test-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-test = "
 postgresql-contrib
 postgresql-server
 postgresql-server-devel
 bash
 glibc
"

URI_postgresql-upgrade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-upgrade-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-upgrade = "
 zlib-ng-compat
 perl-libs
 libxslt
 libxml2
 python3-libs
 postgresql-private-libs
 libicu
 krb5-libs
 pam-libs
 tcl
 uuid
 postgresql-server
 glibc
 libselinux
 openldap
"

URI_postgresql-upgrade-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-upgrade-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-upgrade-devel = "
 glibc
 postgresql-upgrade
 bash
"

URI_postgresql-test-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/postgresql-test-rpm-macros-16.10-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:postgresql-test-rpm-macros = "
 postgresql-server
"
