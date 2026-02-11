
PN = "nodejs-packaging"
PE = "0"
PV = "2023.10"
PR = "9.el10_0"
PACKAGES = "nodejs-packaging nodejs-packaging-bundler"


URI_nodejs-packaging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-packaging-2023.10-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nodejs-packaging = "/usr/bin/python3 ( ) redhat-rpm-config ( )"
RPROVIDES:nodejs-packaging = "rpm_macro(_nodejs_major_version) ( ) rpm_macro(nodejs_default_filter) ( ) rpm_macro(nodejs_find_provides_and_requires) ( ) rpm_macro(nodejs_fixdep) ( ) rpm_macro(nodejs_setversion) ( ) rpm_macro(nodejs_sitearch) ( ) rpm_macro(nodejs_sitelib) ( ) rpm_macro(nodejs_symlink_deps) ( ) rpm_macro(nodejs_version) ( ) nodejs-packaging ( =  2023.10-9.el10_0)"

URI_nodejs-packaging-bundler = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-packaging-bundler-2023.10-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nodejs-packaging-bundler = "/usr/bin/bash ( ) coreutils ( ) jq ( ) findutils ( ) npm ( )"
RPROVIDES:nodejs-packaging-bundler = "nodejs-packaging-bundler ( =  2023.10-9.el10_0)"
