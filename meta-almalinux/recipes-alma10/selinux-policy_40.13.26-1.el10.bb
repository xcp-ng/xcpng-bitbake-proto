
PN = "selinux-policy"
PE = "0"
PV = "40.13.26"
PR = "1.el10"
PACKAGES = "selinux-policy selinux-policy-doc selinux-policy-mls selinux-policy-sandbox selinux-policy-targeted selinux-policy-devel selinux-policy-minimum"


URI_selinux-policy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy = "
 gawk
 policycoreutils
 bash
 selinux-policy-minimum
 coreutils
 rpm-plugin-selinux
"

URI_selinux-policy-doc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-doc-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-doc = "
 selinux-policy
"

URI_selinux-policy-mls = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-mls-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-mls = "
 policycoreutils
 policycoreutils-newrole
 bash
 mcstrans
 coreutils
 selinux-policy
"

URI_selinux-policy-sandbox = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-sandbox-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-sandbox = "
 selinux-policy
 bash
 selinux-policy-targeted
"

URI_selinux-policy-targeted = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/selinux-policy-targeted-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-targeted = "
 coreutils
 bash
 policycoreutils
 selinux-policy
"

URI_selinux-policy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/selinux-policy-devel-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-devel = "
 m4
 checkpolicy
 policycoreutils-devel
 make
 bash
 selinux-policy
"

URI_selinux-policy-minimum = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/selinux-policy-minimum-40.13.26-1.el10.noarch.rpm;unpack=0"
RDEPENDS:selinux-policy-minimum = "
 coreutils
 policycoreutils-python-utils
 bash
 selinux-policy
"
