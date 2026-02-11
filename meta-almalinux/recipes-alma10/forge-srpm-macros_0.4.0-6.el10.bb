
PN = "forge-srpm-macros"
PE = "0"
PV = "0.4.0"
PR = "6.el10"
PACKAGES = "forge-srpm-macros"


URI_forge-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/forge-srpm-macros-0.4.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:forge-srpm-macros = "redhat-rpm-config ( >=  266-1)"
RPROVIDES:forge-srpm-macros = "rpm_lua(fedora.srpm._forge_util) ( ) rpm_lua(fedora.srpm.forge) ( ) rpm_macro(forgeautosetup) ( ) rpm_macro(forgemeta) ( ) rpm_macro(forgesetup) ( ) rpm_macro(forgeversion) ( ) forge-srpm-macros ( =  0.4.0-6.el10)"
