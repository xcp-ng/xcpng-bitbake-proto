
PN = "selinux-policy"
PE = "0"
PV = "40.13.26"
PR = "1.el10"
PACKAGES = "selinux-policy selinux-policy-doc selinux-policy-mls selinux-policy-sandbox selinux-policy-targeted selinux-policy-devel selinux-policy-minimum"


URI_selinux-policy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy = "/bin/sh ( ) /usr/bin/sha512sum ( ) /bin/awk ( ) policycoreutils ( >=  3.8) /usr/bin/bash ( ) selinux-policy-any ( =  40.13.26-1.el10) rpm-plugin-selinux ( if  rpm-libs)"
RPROVIDES:selinux-policy = "rpm_macro(_file_context_file) ( ) rpm_macro(_file_context_file_pre) ( ) rpm_macro(_file_custom_defined_booleans) ( ) rpm_macro(_file_custom_defined_booleans_tmp) ( ) rpm_macro(_selinux_policy_version) ( ) rpm_macro(_selinux_store_path) ( ) rpm_macro(_selinux_store_policy_path) ( ) rpm_macro(selinux_modules_install) ( ) rpm_macro(selinux_modules_uninstall) ( ) rpm_macro(selinux_relabel_post) ( ) rpm_macro(selinux_relabel_pre) ( ) rpm_macro(selinux_requires) ( ) rpm_macro(selinux_requires_min) ( ) rpm_macro(selinux_set_booleans) ( ) rpm_macro(selinux_unset_booleans) ( ) selinux-policy ( =  40.13.26-1.el10) selinux-policy-base ( =  40.13.26-1.el10) config(selinux-policy) ( =  40.13.26-1.el10)"

URI_selinux-policy-doc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-doc-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-doc = "selinux-policy ( =  40.13.26-1.el10)"
RPROVIDES:selinux-policy-doc = "selinux-policy-doc ( =  40.13.26-1.el10)"

URI_selinux-policy-mls = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-mls-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-mls = "/bin/sh ( ) coreutils ( ) selinux-policy ( =  40.13.26-1.el10) policycoreutils ( >=  3.8) setransd ( ) policycoreutils-newrole ( >=  3.8)"
RPROVIDES:selinux-policy-mls = "selinux-policy-any ( =  40.13.26-1.el10) config(selinux-policy-mls) ( =  40.13.26-1.el10) selinux-policy-mls ( =  40.13.26-1.el10)"

URI_selinux-policy-sandbox = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-sandbox-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-sandbox = "/bin/sh ( ) selinux-policy-base ( =  40.13.26-1.el10) selinux-policy-targeted ( =  40.13.26-1.el10)"
RPROVIDES:selinux-policy-sandbox = "selinux-policy-sandbox ( =  40.13.26-1.el10)"

URI_selinux-policy-targeted = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-targeted-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-targeted = "/bin/sh ( ) coreutils ( ) selinux-policy ( =  40.13.26-1.el10) policycoreutils ( >=  3.8)"
RPROVIDES:selinux-policy-targeted = "selinux-policy-any ( =  40.13.26-1.el10) selinux-policy-targeted ( =  40.13.26-1.el10) config(selinux-policy-targeted) ( =  40.13.26-1.el10)"

URI_selinux-policy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/selinux-policy-devel-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-devel = "/bin/sh ( ) selinux-policy ( =  40.13.26-1.el10) policycoreutils-devel ( >=  3.8) /usr/bin/bash ( ) m4 ( ) /usr/bin/make ( ) checkpolicy ( >=  3.8)"
RPROVIDES:selinux-policy-devel = "selinux-policy-devel ( =  40.13.26-1.el10)"

URI_selinux-policy-minimum = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/selinux-policy-minimum-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-minimum = "/bin/sh ( ) coreutils ( ) selinux-policy ( =  40.13.26-1.el10) policycoreutils-python-utils ( >=  3.8)"
RPROVIDES:selinux-policy-minimum = "selinux-policy-any ( =  40.13.26-1.el10) config(selinux-policy-minimum) ( =  40.13.26-1.el10) selinux-policy-minimum ( =  40.13.26-1.el10)"
